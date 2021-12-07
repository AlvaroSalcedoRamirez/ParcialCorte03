/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Trabajo;

import java.util.List;

/**
 *
 * @author KGC
 */
public interface UsuarioService {

    List<Usuario> listar();

    Usuario listarId(int id);

    Usuario add(Usuario u);

    Usuario edit(Usuario u);

    Usuario delete(int id);

}
