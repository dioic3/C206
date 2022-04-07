public class Empresa {
    int cpnj;
    String endereço;
    Fornecedor[] fornecedor;

    void mostrarInfo(){
        System.out.println("CNPJ: " + cpnj);
        System.out.println("Endereço: " + endereço);
        System.out.println(" ");
        for (int i = 0; i < fornecedor.length; i++){
            System.out.println(" ");
            System.out.println("Nome: " + fornecedor[i].nome);
            System.out.println("Email: " + fornecedor[i].email);
            System.out.println("Telefone: " + fornecedor[i].telefone);
            System.out.println("Data de nascimento: " + fornecedor[i].data_de_nascimento);

        }
    }
}
