package com.social.media.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SocialProfile {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;


    @OneToOne
    @JoinColumn(name= "social_user")
    @JsonIgnore
    private  SocialUser user;

    private  String description;







    public void setSocialUser(SocialUser socialUser){
        this.user = socialUser;
        if (user.getSocialProfile() != this)
            user.setSocialProfile(this);
    }



}
