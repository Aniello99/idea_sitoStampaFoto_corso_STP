# idea_sitoStampaFoto_corso_STP
Test creazione, tramite java, di un applicativo che vada a ricreare un sito per un service di stampa foto digitali e personalizzazione di gudget.

Partendo da un esigenza personale quale il voler poter toccare con mano i ricordi fotografici legati ad un particolare evento, l idea è stata quella di ricreare l'app che implementi le funzioni dei più comuni service di stampa foto digitali. 

Si vuole sviluppare un sistema che vada a simulare un app/sito che permetta di caricare le proprio foto digitali e di esse poter poi richederne la stampa cartacea o usarle per personalizzare uno tra i diversi gadget proposti dal service.

Il cliente, entrato nel app, potrà da subito vedere i servizi offerti e da quale prezzo è possibile acquistare i singoli prodotti. Inoltre, in questa prima zona, il cliente sarà informato che acquistando per un valore superiore ad una certa cifra riceverà uno sconto su tale acquisto (ex: spendendo più di 50 euro, si avrà uno sconto del 10%. Se il totale dell'acquisto supera i 100 euro si avrà uno sconto del 20%).
l'app sarà anche dotata di un sistema che, agni domenica (giorno in cui tendenzialmente le persone hanno più tempo da spendere per poter dedicare alla scelta delle loro foto da stampare), scelga in modo randomico uno dei prodotti offerti e lo vada a mettere in sconto di un ulteriore 10% (l'unico vincolo che sarà imposto sulla randomicità è l'impossibilità di un singolo prodotto di essere in sconto per due domeniche consecutive). Nella prima zona dell'app sarà quindi mostrato per intera settimana il prodotto che andrà in sconto del 10% quella settimana. 

in questa prima prototipazione l'idea è quella di offrire al cliente i seguenti servizi:
-stampa foto su carta
-stampa foto su tela
-personalizzazione tazza con foto
-personalizzazione T-shirt con foto
-personalizzazione portachiavi con parola

Andando a selezionare uno dei prodotti si sarà condotti in una zona dedicata in cui sarà possibile vedere le varie proposte acquistabili e il relativo prezzo.

OSSERVAZIONE: sarà possibile riuscire a vedere i prezzi di tutti i prodotti anche senza essere loggato ma per effettuare il caricamento delle foto (o nel caso del portachiavi: per fissare la parola da stampare)
sarà richiesto l'accesso o creazione di un account al quale sarà associato un carrello.
Di conseguenza, nella schermata principale si avranno anche le voci:
 -crea account
 -accedi all'account
//dovremo gestire l unicità degli account(ad una mail può essere associato un solo account), l'errore password e password dimenticata.
//ogni account dovrà possedere: nome; cognome; mail; id identificativo univoco; password; (la password non sarà keysensitive)


*Caso "stampa foto su carta":
    Il cliente potrà scegliere tra 'Stampe classiche'(senza bordi) e 'Stampe stile polaroid'(con bordi).
    
      Per le 'Stampe classiche' si potrà poi scegliere uno tra i formati disponibili(ex: 12x12;12x16;12x18) ai quali sarà associato il relativo prezzo e poi il tipo di finitura della stampa (ex: finitura lucida, 
      finitura opaca)che però non influenzerà il prezzo dell'acquisto.
      
      Per le 'Stampe stile polaroid' si potrà poi scegliere uno tra i formati disponibili(ex: 8x10;12x15) ai quali sarà associato il relativo prezzo e poi il colore del bordo della foto tra quelli 
      disponibili(ex:bianco; nero; celeste; rosa; rosso)che però non influenzerà il prezzo dell'acquisto.

    Fissato il prodotto si passa al caricamento delle immagini. //in questo test non sarà gestito, ma dobbiamo fare in modo che sia possibile caricare più foto.
    Conoscendo il numero di foto caricate, il sistema creerà un "prodotto personalizzato" con tutte le sue specifiche e relativo prezzo che andrà nel carrello associato all utente. 

      
*Caso "stampa foto su tela":
   Il cliente potrà scegliere uno tra i formati disponibili (ex:20x20;30X40;40x40) ai quali sarà associato il relativo prezzo
   
   Fissato il prodotto si passa al caricamento dell'immagine. //in questo test non sarà gestito ma dobbiamo garantire che sia caricata una singola foto.
   Conoscendo le specifiche del prodotto, il sistema creerà un "prodotto personalizzato" con tutte le sue specifiche e relativo prezzo che andrà nel carrello associato all'utente. 

   
*Caso "personalizzazione tazza con foto":
   Il cliente potrà scegliere uno tra i colori disponibili (ex: bianca; celeste; rosa) che però non influenzerà il prezzo dell'acquisto. //si avrà lo stesso prezzo per tutti i colori.
   
   Fissato il prodotto si passa al caricamento dell'immagine. //in questo test non sarà gestito ma dobbiamo garantire che sia caricata una singola foto.
   Conoscendo le specifiche del prodotto, il sistema creerà un "prodotto personalizzato" con tutte le sue specifiche e relativo prezzo che andrà nel carrello associato all'utente. 

   
*Caso "personalizzazione T-shirt con foto":
   Il cliente potrà scegliere uno tra i colori disponibili (ex: bianca; nera) e poi la taglia (ex: S; M; L; XL) che non andrà a modificare il prezzo del prodotto.
   //si avrà lo stesso prezzo indifferentemente dal colore e dalla taglia.
   //la stampa sarà applicata di default sul fronte della T-shirt ma è possibile prevedere la funzione per cui avere la stampa sul retro o su entrambi i lati con stessa o diversa immagine(ora non implementato).
   
   Fissato il prodotto si passa al caricamento dell'immagine. //in questo test non sarà gestito ma dobbiamo garantire che sia caricata una singola foto.
   Conoscendo le specifiche del prodotto, il sistema creerà un "prodotto personalizzato" con tutte le sue specifiche e relativo prezzo che andrà nel carrello associato all'utente. 

   
*Caso "personalizzazione portachiavi con parola":
  Il cliente potrà scegliere uno tra i formati disponibili (ex: rettangolare; circolare) che però non influenzerà il prezzo dell'acquisto. //si avrà lo stesso prezzo per tutti i formati.
  //per ora si lascia l impossibilità di modificare il colore e il font della parola da stampare che al momento sarà di default di colore nero e con font roman.
   Fissato il prodotto si passa al caricamento della parola. il sistema fisserà il limite di 12 caratteri 
   Conoscendo le specifiche del prodotto, il sistema creerà un "prodotto personalizzato" con tutte le sue specifiche e relativo prezzo che andrà nel carrello associato all'utente.



Una volta che è stato creato un "prodotto personalizzato", l'utente loggato può procedere all'acquisto entrando nella sezione carrello o creare un nuovo "prodotto personalizzato" dalla schermata principale che ora avrà anche la voce carrello (visto che è stato effettuato l accesso).
Il carrello dovrà in automatico indicare tutti i "prodotti personalizzati" al suo interno con i relativi prezzi, valutare se uno tra i prodotti presenti è il prodotto in offerta della settimana e se è domenica applicare il 10% di sconto su tale prodotto e indicarlo, indicare la somma del prezzo di tutti i prodotti e se quest è maggiore delle cifre fissate, applicare lo sconto associato.
La zona di pagamento non sarà gestita ma il sistema porterà l utente della zona degli "ordini effettuati" in cui si avrà lo storico di tutti gli acquisti del singolo utente. 
Quindi nelle condizione in  cui l utente è loggato, le voci della schermata principale saranno:
-ordini effettuati
-carrello
-stampa foto su carta
-stampa foto su tela
-personalizzazione tazza con foto
-personalizzazione T-shirt con foto
-personalizzazione portachiavi con parola
-modifica account

//nella sezione "modifica account", l utente può cambiare i sui dati personali quali: nome; cognome; password; 


infine, per rendere l'app utilizzabile al maggior numero di utenti possibili, si prova ad implementare il sistema in modo tale che si possa scegliere tra lingua italiana e lingua inglese. 
per farlo, una possibile strategia è l uso di due files in cui sono riportate tutte le frasi utilizzate nel sistema in entrambe le lingue.
