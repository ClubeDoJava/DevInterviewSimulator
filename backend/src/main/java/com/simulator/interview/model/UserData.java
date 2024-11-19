package com.simulator.interview.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity

public class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    private String stack; // Frontend, Backend, etc.
    private String frameworks; // React, Spring, etc.
    private String level; // Junior, Pleno, Senior

    public String getStack() {
        return null;
    }
}
