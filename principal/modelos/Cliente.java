package principal.modelos;

import principal.modelos.files.Reader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {

    private String nome;
    private Integer id;

    public Cliente() { }

    public Cliente(String nome, Integer id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getId() {
        return id;
    }

    public void listarCliestes() throws IOException {
        Reader reader = new Reader();
        String caminhoDoArquivo = "C:\\Restaurante\\Listas\\ListaCliente.txt";
        reader.mostrarArquivo(caminhoDoArquivo);
    }


}
