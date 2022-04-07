public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.cpnj = 12345;
        empresa.endereço = "Rua Leonardo Castelo Branco";

        Fornecedor[] fornecedor = new Fornecedor[3];
        fornecedor[0] = new Fornecedor();
        fornecedor[0].nome = "Joyce";
        fornecedor[0].email = "Joyce@gmail.com.br";
        fornecedor[0].telefone = "45793243432";
        fornecedor[0].data_de_nascimento = "01/07/2002";

        fornecedor[1] = new Fornecedor();
        fornecedor[1].nome = "Matheus";
        fornecedor[1].email = "Matheus@gmail.com.br";
        fornecedor[1].telefone = "89382492842904";
        fornecedor[1].data_de_nascimento = "89/01/98";

        Fornecedor fornecedor1 = new Fornecedor();
        fornecedor1.nome = "Hadassa";
        fornecedor1.email = "Hadassa@gmail.com.br";
        fornecedor1.telefone = "928313091238";
        fornecedor1.data_de_nascimento = "98/01/98";
        fornecedor[2] = fornecedor1;

        empresa.fornecedor = fornecedor;
        empresa.mostrarInfo();
    }
}
