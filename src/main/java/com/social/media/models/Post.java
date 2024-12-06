package com.social.media.models;

import jakarta.persistence.*;
import lombok.Data;
import org.apache.catalina.User;

@Data
@Entity
public class Post {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;



    @ManyToOne
    @JoinColumn(name="user_id")
    private SocialUser socialUser;












}
