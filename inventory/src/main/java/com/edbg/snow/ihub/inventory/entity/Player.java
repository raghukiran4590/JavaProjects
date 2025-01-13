package com.edbg.snow.ihub.inventory.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.OptimisticLockType;
import org.hibernate.annotations.OptimisticLocking;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "player")
@DynamicUpdate
@OptimisticLocking(type = OptimisticLockType.ALL)
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private Integer id;

    @NonNull
    @Column(name="USERNAME", nullable = true)
    private String username;

    @Column(name="EMAIL", nullable = true)
    private String email;

    @NonNull
    @Column(name="PASSWORD", nullable = true)
    private String password;

    @Version
    private Long version;

}
