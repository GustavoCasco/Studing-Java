package com.example.demo.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tipocliente")

public class TipoCliente {
			@Id
			private int idtipocliente;
			private String desctipocli;
}
