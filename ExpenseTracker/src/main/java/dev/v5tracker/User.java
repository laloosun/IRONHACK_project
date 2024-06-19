package dev.v5tracker;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String username;
    private String password;
