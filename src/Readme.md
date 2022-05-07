
# Problem
   We want to simulate a simple population. This population consists of cellular automats, with each
   cell having two states: alive or dead. Every cell has 8 neighbors (Moore-Neighborhood). The state of
   the cell depends on it’s current state and the number of living and dead neighbors. The goal is, to
   simulate the evoluion of an initial population. The subsequent generation is a result of the prior one.
   Hence, care for not mixing the states between the generations. Develop a software, which models
   the evolution of the population and visualizes the result as a grid with colored squares.



# Evolution rules
   Adjust the rule set from homework 2 to the following rules:
   I. Dead cell
   a. Cell reincarnates if it has got exacly 3 living neighbors
   b. Else it stays dead
   II. Living cell
   a. Cell stays alive if it has got exacly 2, 4 or 5 living neighbors
   b. In all other cases the cell dies

## I have used processing 3D for visualize this.


                                          Thank you