package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class News extends BaseItem{  // buscou tudo de BaseItem para não reperir código com a classe Feature

}
