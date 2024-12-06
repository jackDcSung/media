package com.social.media.models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class SocialGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;



    @ManyToMany(mappedBy ="groups")
    private Set<SocialUser> socialUsers=new HashSet<>();














}
