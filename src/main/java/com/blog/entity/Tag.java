package com.blog.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tag")
public class Tag extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tag_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @JsonIgnore
    @ManyToMany
    @JoinTable(name="post_tag",
            joinColumns = @JoinColumn(name="tag_fk"),
            inverseJoinColumns = @JoinColumn(name="post_fk"))
    private List<Post> posts = new ArrayList<>();
}


