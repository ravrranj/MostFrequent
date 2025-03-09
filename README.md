  int MostFrequentNum = -1;
  int maxFrequency = 0;

  for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
    if(entry.getValue() > maxFrequency) {
        maxFrequency = entry.getValue();
        MostFrequentNum = entry.getKey();
    }
  }

  //print the most frequent number
  System.out.println("Most frequent number: " +  MostFrequentNum + " (appeared " + maxFrequency + " times)");
