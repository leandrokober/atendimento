package com.assistencia.helpdesk.atendimento.services;

import com.assistencia.helpdesk.atendimento.models.Customer;
import com.assistencia.helpdesk.atendimento.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {


///    @Autowired
  //  private CategoriaRepository categoriaRepository;

    @Autowired
    private CustomerRepository customerRepository;

    public void instaciaDB() {
       /** Customer c1 = new Customer ( null,"Leandro Kober", "888.888.888-88", "Rua do Futuro", "10", "Apto. 603", "Recife", "PE", "(81) 99977-5659", "lkober@hotmail.com");
        Customer c2 = new Customer ( null,"Rui Barbosa", "111.111.111-11", "Avenida Recife", "234", "Casa", "Recife", "PE", "(81) 11111-1111", "rui@gmail.com");
        Customer c3 = new Customer ( null,"Joanna Darc", "222.222.222-22", "Avenida Agamenon MagalhãesRua do Futuro", "5670", "Puxadinho", "Recife", "PE", "(81) 22222-2222", "jojo@bol.com.br");
        Customer c4 = new Customer ( null,"Pedro Álvares Cabral", "333.333.333-33", "Avenida Conselheiro Aguiar", "890", "1o Andar", "Recife", "PE", "(81) 33333-3333", "pedroka@elogica.com.br");
        Customer c5 = new Customer ( null,"Katarina de Mèdici", "444.444.444-44", "Rua dos Navegantes", "346", "Térreo", "Recife", "PE", "(81) 44444-4444", "katarina@outlook.com");
        Customer c6 = new Customer ( null,"Barack Obama", "555.555.555-00", "Avenida Caxangá", "1234", "Apto. 101", "Recife", "PE", "(81) 555555-5555", "brahma@hotmail.com");

        customerRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5, c6));
        **/



     /**   Categoria cat1 = new Categoria(null, "Informática", "Livro de TI");Categoria cat2 = new Categoria(null, "Ficção Científica", "Ficção Científica");
        Categoria cat3 = new Categoria(null, "Biografias", "Livros de Biografias");

        Livro l1 = new Livro(null, "Clean code", "Robertin Martin", "Lorem ipsum", Tamanho.MEDIO, cat1);
        Livro l2 = new Livro(null, "Engenharia de Software", "Louis V. Gerstner", "Lorem ipsum", Tamanho.GRANDE, cat1);
        Livro l3 = new Livro(null, "The time machine", "H. G. Wells", "Lorem ipsum", Tamanho.MEDIO, cat2);
        Livro l4 = new Livro(null, "The war of the worlds", "H. G. Wells", "Lorem ipsum", Tamanho.PEQUENO, cat2);
        Livro l5 = new Livro(null, "I, robot", "Isaac Asimov", "Lorem ipsum", Tamanho.GRANDE, cat2);

        cat1.getLivro().addAll(Arrays.asList(l1, l2));
        cat2.getLivro().addAll(Arrays.asList(l3, l4, l5));

        categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));**/

    }
}
