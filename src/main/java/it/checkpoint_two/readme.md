SECONDO CHECKPOINT JAVA 11

1) Scrivere un metodo processFile(String filename) che prende in input un file di te-
   sto con indirizzo filename, legge le righe del file rimuovendo spazi all’inizio e alla fi-
   ne delle righe e inserisce tali righe in una lista che poi verrà ritornata.

2) Scrivere un metodo processLines(List<String>) che prende in input una lista di ri-
   ghe e ritorna una mappa con chiavi Character e valori Integer.

Per ognuna delle righe:
a) Se la riga è vuota, stampa un messaggio per informare l’utente e non fa nulla.
b) Altrimenti divide la riga in parole (eliminando eventuale punteggiatura) e inserisce

nella mappa come chiave il carattere con il quale inizia la parola e come valore il nu-
mero di parole che iniziano con tale carattere.

ESEMPIO: se nel file di testo è contenuto
“sopra la panca la capra campa
sotto la panca, la capra crepa”
la mappa sarà: {‘s’: 2, ‘l’:4, ‘p’: 2, ‘c’: 4}
3) Scrivere un metodo writeResult(String filename, Map<Character,Integer>) che
   scrive nel file con indirizzo filename la mappa nel formato
   chiave -> valore
   Nell’esempio precedente nel file dovrà essere scritto:
   s -> 2
   l -> 4
   p -> 2
   c -> 4