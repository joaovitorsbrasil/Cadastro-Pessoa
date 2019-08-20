public class Main {

            public static void main(String[] args) 
            {

            Pessoa pessoa1 = new Pessoa("Joao", 16, "Masculino");

            Pessoa pessoa2 = new Pessoa("Tiago", 15, "Masculino");

            Pessoa pessoa3 = new Pessoa("Luiz Gustavo", 12, "indefinido");

            Endereco endereco1 = new Endereco("Brejaru", "Ao lado do X burgao", 123);

            Endereco endereco2 = new Endereco("Jardim Eldorado", "Rua Olavo Bilac", 873);

            Endereco endereco3 = new Endereco("Ponte do Imaruim", "Rua Felipe de Almeida ", 354);


            System.out.println("O nome da primeira pessoa é " + pessoa1.getNome() + ", ele tem " + pessoa1.getIdade() + " anos e é do sexo: " + pessoa1.getSexo() + ". " + "ele mora no bairro: " + endereco1.getBairro() + ", na rua: " + endereco1.getRua() + " N#" + endereco1.getNumero());
            
            System.out.println("O nome da segunda pessoa é " + pessoa2.getNome() + ", ele tem " + pessoa2.getIdade() + " anos e é do sexo: " + pessoa2.getSexo() + ". " + "ele mora no bairro: " + endereco2.getBairro() + ", na rua: " + endereco2.getRua() + " N#" + endereco2.getNumero());
            
            System.out.println("O nome da terceira pessoa é " + pessoa3.getNome() + ", ela tem " + pessoa3.getIdade() + " anos e é do sexo: " + pessoa3.getSexo() + ". " + "ela mora no bairro: " + endereco3.getBairro() + ", na rua: " + endereco3.getRua() + " N#" + endereco3.getNumero());
            }
    }