;; Local Variables:
;; mode: org
;; eval: (auto-fill-mode 1)
;; fill-column: 100
;; End:


# User Stories
## DONE 1
   *In order to* save money
   *As a* bank client
   *I want to* make a deposit in my account

## DONE 2
   *In order to* retrieve some or all of my savings
   *As a* bank client
   *I want to* make withdrawal from my account

## DONE 3
   *In order to* check my operations
   *As a* client
   *I want to* see the history (operation, date, amount, balance) of my operations

### Questions

#### opened
##### What are your expectations?
##### What will you judge?
##### how will be the client?
###### reformulated: What do you mean by API? Is it a JAVA interface, or more like HTTP/REST API or in a broader sense?
       - [ ] human interaction
       - [ ] http client
       - [ ] a =main= method

#### closed (ask for precision)
##### is the tests quality relevant?
##### their number relevant?
##### the commit atomicity relevant?
##### the final design relevant?
##### the method relevant?
##### is the number of USs accomplished relevant?
##### Is there a method to prefer (Top-Bottom vs Bottom-Up)?
##### What is the level of complexity expected?
###### For representing money for example. Is it better to prefer int or objects?
       it will depend on planned evolutions.
#### meta-questions (to end with)
##### Is it an important question that I shall ask you and that I didn't think to ask?

## client / account / bank
   - [ ] do we need these entities
   - [ ] who owns the responsibility of making a deposit
     account or client
   -
## TODO find better term for money in account
## TODO account : notion of creditor/debitor?
