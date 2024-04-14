package com.example.users;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
    private String state;
    private Object response;
    private String error;

    public Response(String state, Object response, String error) {
        this.state = state;
        this.response = response;
        this.error = error;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("response")
    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    @JsonProperty("error")
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
