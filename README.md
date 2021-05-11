# What I learned
- Model View Controller design pattern.
* Implemented functionality to the UI.
- 3D graphic manipulation.
- Genetic algorithm fundamentals.
- Research a real world topic, in this case neurology, and model it.
- Find area that needs innovation in a field, and (attempt) to fill that void.
- Created handful of own algorithms to solve specific problems, and weighed their memory/speed tradeoffs.
- Used front end software such as SceneBuilder to quickly and effectively create UI.

# Description and reading material
Some good material to wet your tastebuds for this topic:
  - https://www.youtube.com/watch?v=obAHnwp9tOM
  - https://www.youtube.com/watch?v=QJ8AW5pi2T4

More advanced material:
  - https://www.coursera.org/learn/computational-neuroscience
  - Paul Miller, An Introductory Course in Computational Neuroscience

   Research in Computational Neuroscience is done from many different angles, some focus on the "big picture" computation involving different large regions of the brain. Others focus on
single neurons themselves, and try to delve into every single detail. Of course even a single neuron is an extremely difficult object to model with high 
accuracy, it being a chemical object it is prone to being stochastic, and so it is modeled as such, requiring complex programs. Though these programs are very high resolution, 
it is absolutely horrible at modeling neurons at larger scales because it needs so much processing power, and this very complexity you put in the system clouds the 
core computational truths that actually matters. For example, fat tissues and veins obviously influence the formation and behaviour of neurons, and yet are irrelevant to the 
computation itself,therefore these variables "fat" and "blood" can be discarded from the models. Likewise in a computer, the metals, plastics, and varying temperatures are
irrelevant, only the logic gates and architecture are important for the computation.

  A current problem in research, specifically research in the sub field of Neural Circuitry, is that enormous time and energy is spent essentially "guess-and-checking" what 
various neural circuits in the nervous system do, and how they do it. How a circuit takes information and outputs new information is a back breaking question. New tools are 
required to make this process easier.

  Neural Circuit simulator attempts to be such a tool, and works to simplify/discretize, and model the interactions of neurons in a neural circuit such that the essential elements of computation 
are preserved.  On top of this, a genetic algorithm can be used to sift through the near infinite variety of neural circuits to find an optimal local maximum 
that takes your set of inputs and gives the correct output for every instance.

# ToDo:
  - Make Linux compatible
  - Refactor Neuron and Axon object array as a dictionary.
  - Moar tests.
  - IncidenceList details
  - All neurons must be connected to each other. ie no stray neurons or island clusters.
  - Step() needs fixing, neuron should be off if it is not activated by other neurons by the next Step. (Test)
  - (!!!)Make readOutput(), if an output neuron is activated record the "total output".
  - Color axons based on weather they are exitatory or inhibitory.

Future version details to work out:
  - Determine weather cyclical NCs are legal in the models, or weather it should be an added option.
  - Currently the time intervals are dicrete and not continuous, meaning only digital computation can be modeled.
  - (UI) Make "example circuits" tab to show off real life neural circuits the program has sucessfully made.
  - (UI) include tools to help you visualize what's going on (This is where Pythons scientific libraries would be amazing, could transition project to Python in the future for this reason alone).
  *A simple test case for the Genetic Algorithm would be to see if it can produce the neual circuit equivalent of a "half adder", 
the essential component to add 2 bits in a computer.

