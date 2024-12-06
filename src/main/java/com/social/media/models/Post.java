package com.social.media.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.User;

@Entity
@Getter
@Setter
public class Post {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;



    @ManyToOne
    @JoinColumn(name="user_id")
    @JsonIgnore
    private SocialUser socialUser;












}
