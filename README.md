The dataset
*************

2 datasets can be downloaded here:

1) a training set of 5,000 examples
http://brandewinder.blob.core.windows.net/public/digitssample.csv

2) a validation set of 500 examples; this dataset is supplied so that
you can evaluate the performance of your classification model on
"fresh" data that hasn't been used to construct the classifier.
http://brandewinder.blob.core.windows.net/public/digitscheck.csv

The files are CSV files; the first line contains column labels and
each subsequent row represents a scanned hand-written digit:

* the first element is the actual digit (0 to 9)
* the next 784 elements are the 28 x 28 pixels of the image, flattened
  into a single vector. Each pixel is gray scale, from 0 (pure black) to 255 (pure white).

The full 50,000 training example dataset is available at http://www.kaggle.com/c/digit-recognizer.


Naive KNN (K Nearest Neighbors) algorithm
********************************************

Naive KNN in Pseudo Code:

  Given a Target = an unlabeled Observation:Pixels,
  Given a Training Set of Examples = (Label:Actual Digit, Observation:Pixels),
  Given a Distance function between Observations,

  For every Example, compute Distance between Example and Target,
  Find the Neighbors = K Examples with smallest distance to Target,
  Return the most frequent Label among the Neighbors

Simplest thing that could possibly work: 1-Nearest Neighbor ("Closest Neighbor")

  From the training set,
  Find the closest example to the Target,
  Return its Label


Suggested plan of attack
**************************

- Read the training set into a collection of "examples", with a Label (the actual number) and their pixels.
- Start with the Euclidean Distance to measure similarity between images:
  X = [ x1; x2; .. xn ]
  Y = [ y1; y2; .. yn ]
  Dist(X, Y) = (x1-y1)^2 + (x2-y2)^2 .. + (xn-yn)^2
- Build a "Closest Neighbor" classifier
- Check what proportion of the Validation Set gets properly classified using that model

... now find ways to improve the model :)

More information
******************

More on the KNN algorithm:
http://en.wikipedia.org/wiki/K-nearest_neighbor_algorithm

Discussion on algorithm approaches and improvements
http://www.kaggle.com/c/digit-recognizer

Slides:
https://docs.google.com/presentation/d/17amRTjLFi_2KhUn8qU9nWnwVScpoF2kgJBOEBHxSkl4/edit?usp=sharing

On GitHub:
https://github.com/strangeloop/lambdajam2013/tree/master/jams/learning
https://github.com/strangeloop/lambdajam2013