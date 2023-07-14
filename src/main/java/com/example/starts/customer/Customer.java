package com.example.starts.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Objects;

@Entity
@Table
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Customer {
    @Id
    private long id;
    @NotBlank (message = "name must not be empty")
    private String name;

    @Email (message = "email must not be empty")
    private String email;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotBlank (message = "password must not be empty")
    private String password;


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @JsonIgnore
    public String getPassword() {
        return password;
    }

    //@JsonProperty("customer_id")
    public long id() {
        return id;
    }


    public @NotBlank String name() {
        return name;
    }

    public String email() {
        return email;
    }

}
