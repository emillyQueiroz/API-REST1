package com.example.demo.model;
import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL) // relacionamento 1 para 1, o usuario tem uma conta
    private Account account;
    @OneToOne(cascade = CascadeType.ALL) // relacionamento 1 para 1, o usuario tem um card
    private Card card;
    @OneToMany (cascade = CascadeType.ALL) // relacionamento 1 para muitos um usuário tem muitas features
    private List<Feature> features;
    @OneToMany (cascade = CascadeType.ALL) // relacionamento 1 para muitos um usuário tem muitas news
    private List<News> news;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }
}