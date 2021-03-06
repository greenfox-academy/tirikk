package com.greenfox.tirikk.reddit.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  String title;
  String href;

  @ManyToOne
  @JoinColumn(name = "username")
  User owner;

  int score;
  Timestamp timestamp;

  public Post() {
  }

  public Post(String title, String href, User owner) {
    this.title = title;
    this.href = href;
    this.owner = owner;
    this.score = 0;
    this.timestamp = new Timestamp(System.currentTimeMillis());
  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getHref() {
    return href;
  }

  public int getScore() {
    return score;
  }

  public Timestamp getTimestamp() {
    return timestamp;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public void setTimestamp(Timestamp timestamp) {
    this.timestamp = timestamp;
  }

  public void upvote() {
    score++;
  }

  public void downvote() {
    score--;
  }

  public User getOwner() {
    return owner;
  }

  public void setOwner(User owner) {
    this.owner = owner;
  }
}
