import java.util.Arrays;

public class Caesar {


    static String cypher(String s, int delta) {
        //passam a majuscula perque no ens dongui problemes al xifratge
        //declaram stringbuilder per anar ficant el missatge xifrat
        StringBuilder sb = new StringBuilder(s.toUpperCase());
        //declaram una variable lletra per mourer-la
        int lletra;
        //movem lletra a lletra
        for (int i = 0; i < sb.length(); i++) {
            //miram si el caràcter és o no una lletra
            if (sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z') {
                //la lletra li sumam el moviment
                lletra = delta + sb.charAt(i);
                //si la caracter es major que 90 no sera vocal i li hem de restar les lletres del abecedari fins que sigui menor que Z
                while (lletra > 90) {
                    lletra -= 26;
                }
                //colocam la lletra moguda dins el string
                sb.setCharAt(i, (char) lletra);
                //en el cas que no sigui una lletra simplement feim que deixi la lletra com estava
            } else {
                sb.setCharAt(i, sb.charAt(i));
            }
        }
        return sb.toString();
    }

    static String decypher(String s, int delta) {
        //declaram stringbuilder
        StringBuilder sb = new StringBuilder(s.toUpperCase());
        int lletra;
        for (int i = 0; i < sb.length(); i++) {
            //miram si el caràcter és o no una lletra
            if (sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z') {
                //la lletra li restam el delta
                lletra = sb.charAt(i) - delta;
                while (lletra < 65) {
                    lletra += 26;
                }
                sb.setCharAt(i, (char) lletra);
            } else {
                sb.setCharAt(i, sb.charAt(i));
            }
        }
        return sb.toString();
    }

    static String magic(String s) {
        String s2;
        int ar[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                ar[0]++;
            }
            if (s.charAt(i) == 'B') {
                ar[1]++;
            }
            if (s.charAt(i) == 'C') {
                ar[2]++;
            }
            if (s.charAt(i) == 'D') {
                ar[3]++;
            }
            if (s.charAt(i) == 'E') {
                ar[4]++;
            }
            if (s.charAt(i) == 'F') {
                ar[5]++;
            }
            if (s.charAt(i) == 'G') {
                ar[6]++;
            }
            if (s.charAt(i) == 'H') {
                ar[7]++;
            }
            if (s.charAt(i) == 'I') {
                ar[8]++;
            }
            if (s.charAt(i) == 'J') {
                ar[9]++;
            }
            if (s.charAt(i) == 'G') {
                ar[10]++;
            }
            if (s.charAt(i) == 'L') {
                ar[11]++;
            }
            if (s.charAt(i) == 'M') {
                ar[12]++;
            }
            if (s.charAt(i) == 'N') {
                ar[13]++;
            }
            if (s.charAt(i) == 'O') {
                ar[14]++;
            }
            if (s.charAt(i) == 'P') {
                ar[15]++;
            }
            if (s.charAt(i) == 'Q') {
                ar[16]++;
            }
            if (s.charAt(i) == 'R') {
                ar[17]++;
            }
            if (s.charAt(i) == 'S') {
                ar[18]++;
            }
            if (s.charAt(i) == 'T') {
                ar[19]++;
            }
            if (s.charAt(i) == 'U') {
                ar[20]++;
            }
            if (s.charAt(i) == 'V') {
                ar[21]++;
            }
            if (s.charAt(i) == 'W') {
                ar[22]++;
            }
            if (s.charAt(i) == 'X') {
                ar[23]++;
            }
            if (s.charAt(i) == 'Y') {
                ar[24]++;
            }
            if (s.charAt(i) == 'Z') {
                ar[25]++;
            }
        }
        int pos = 0;
        int major = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > major) {
                major = ar[i];
                pos = i;
            }
        }
        String abecedari = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int lletra = abecedari.charAt(pos) - 'E';
        if (lletra < 26) {
            lletra += 26;
        }
        s2 = decypher(s, lletra);
        return s2;
    }

}

