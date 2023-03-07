1) Si progetti una classe Car con i seguenti attributi:
- id (preferibilmente auto incrementale)
- targa
- modello
- marchio
- un prezzo sottoforma di double
- un intero rappresentante i km per litro
- isElettrica, un attributo che è true quando l'auto ha un motore elettrico

Implementare un costruttore con tutti gli attributi e uno solo con targa, marchio e modello,
oltre ai getter per tutti gli attributi e un setter per il prezzo.
La classe avrà inoltre il seguente metodo:
- isGreen() che ritorna true o se l'auto è elettrica oppure se non è elettrica ma fa più di 20km
  al litro.

2) Creare poi una classe Concessionaria che ha come attributi:
- nome
- indirizzo
- una lista di automobili in vendita

Implementare un costruttore con tutti gli attributi e un altro che inizializza vuota la lista.
Implementare i getter per tutti gli attributi e un setter per l'indirizzo. Aggiungere inoltre i seguenti
metodi:
- addCar(Car c) che aggiunge la Car c alla concessionaria.
- getPrezzoMedio() che ritorna la media dei prezzi delle auto della concessionaria.

3) Creare una classe Main nella quale:
   a) Istanziare 4 oggetti di tipo Car.
   b) Creare una lista nella quale inserire i primi due oggetti di tipo car, e creare un oggetto Concessionaria
   concA a cui passeremo la lista come valore nel costruttore.
   c) Istanziare la Concessionaria concB usando il costruttore senza la lista come parametro, e poi aggiungere
   le altre due Car alla Concessionaria.
   d) Stampare tutte le Car della concA che sono green.
   e) Stampare la concessionaria con il prezzo medio più alto.
   f) Creare un insieme di oggetti di tipo Car ed inserirvi tutte le auto di concA e concB.
   g) Stampare la somma di tutti i prezzi delle Car contenute nell'insieme.