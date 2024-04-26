import java.util.Scanner;

import br.edu.up.models.*;
import br.edu.up.models.Prompt;

public class Programa {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        Compromisso compromisso = new Compromisso();
        Dia dia = new Dia();
        Mes mes = new Mes();

        System.out.println("Informe o nome da pessoa que terá o compromisso: ");
        compromisso.setPessoa(Prompt.lerLinha());
        System.out.println("Informe o local do compromisso: ");
        compromisso.setLocal(Prompt.lerLinha());
        System.out.println("Informe o Asssunto do compromisso: ");
        compromisso.setAssunto(Prompt.lerLinha());
        System.out.println("Informe a hora do compromisso: ");
        compromisso.setHora(Prompt.lerInteiro());

        System.out.println("Informe o dia do compromisso:");
        int diaDoCompromisso = Prompt.lerInteiro();
        dia.setDiaMes(diaDoCompromisso);
        dia.adicionarCompromisso(compromisso);
        

        







        leitor.close();
    }
}
