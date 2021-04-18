package com.escuela.releasemanager.deserializer;

import com.escuela.releasemanager.exceptions.JiraResponseDeserializingException;
import com.escuela.releasemanager.model.IssueModel;
import com.escuela.releasemanager.model.IssueSearchModel;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JiraIssueDeserializer extends JsonDeserializer<IssueSearchModel> {

    public JiraIssueDeserializer() {
    }

    @Override
    public IssueSearchModel deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)  {
        List<IssueModel> issueList = new ArrayList<>();
        IssueSearchModel issueSearchModel = new IssueSearchModel();
        JsonNode jiraIssueResponseNode = null;
        try {
            jiraIssueResponseNode = jsonParser.getCodec().readTree(jsonParser);
        } catch (IOException e) {
          throw new JiraResponseDeserializingException("Something went Wrong With Jira Response Deserialization");
        }
        ArrayNode issueMetadataArray = (ArrayNode) jiraIssueResponseNode.get("issues");
        issueMetadataArray.iterator().forEachRemaining(jsonNode ->
                {
                    var issueModel = IssueModel.builder()
                            .withProjectKey(jsonNode.get("fields").get("project").get("key").asText())
                            .withIssueKey(jsonNode.get("key").asText())
                            .withIssueType(jsonNode.get("fields").get("issuetype").get("name").asText())
                            .withIssueSummary(jsonNode.get("fields").get("summary").asText())
                            .build();
                    issueList.add(issueModel);
                }
        );
        issueSearchModel.setIssues(issueList);
        return issueSearchModel;
    }
}
