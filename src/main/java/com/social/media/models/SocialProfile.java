package com.social.media.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SocialProfile {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;


    @OneToOne
    @JoinColumn(name= "social_user")
    private  SocialUser user;













}
