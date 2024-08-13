package com.anhduc.mevabe.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "users")
public class User extends AuditAble{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID id;
    String email;
    String password;
    String firstName;
    String lastName;
    String phone;
    @Temporal(TemporalType.DATE)
    Date dob;
    String address;
    Integer point;

//    @Enumerated(EnumType.STRING)
//    UserVerifyStatus verify;

    @ManyToMany
    Set<Role> roles;
}
