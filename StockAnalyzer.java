/**
 * Step 1: StockAnalyzer Class
 * 
 * The StockAnalysisApp class is the main class that initiates stock data analysis.
 */


import java.util.ArrayList;

public class StockAnalyzer {
    
/**
* Step 2: Main Method
* 
* The main medthod where the program starts.
* 
* @param args Command-line arguments (not used in this example).
*/

     public static void main(String[] args){
        // Step 3: Sample Stock Data initialization
        // Sample array representing daily opening stock prices
        float[] openingPrices = {10.5f, 11.2f, 12.8f, 10.5f, 11.0f, 10.5f, 11.2f, 12.8f, 10.5f, 11.0f};

        //Step 4: ArrayList Initialization 
        //Arraylist to store daily opening stock prices.
        ArrayList<Float> openingPricesList = new ArrayList<>();

        // Adding stock prices from the array to ArrayList
        for(float price : openingPrices){
            openingPricesList.add(price);
        }

        // Step 5: StockProcessor instance creation
        // Creating an instance of StockProcessor for analyzing stock data.
        StockProcessor stockProcessor = new StockProcessor();

        // Step 6: Average Stock Price Calcultion
        // Calculate and print the average stock price
        double averagePrice = stockProcessor.calculateAveragePrice(openingPrices);
        System.out.println("Average Opening Stock price: "+ averagePrice);

        // Step 7: Maximum Stock Price Determination
        // Find and print the maximum opening stock price.
        float maxPrice = stockProcessor.findMaximumPrice(openingPrices);
        System.out.println("Maximum Opening Stock Price: "+ maxPrice);

        // Step 8: Counting Occurances of a Target Price
        // Define a target price for counting occurences
        float targetPrice = 11.0f;

        int occurencesTime = stockProcessor.countOccurences(openingPrices, targetPrice);
        System.out.println("Occurance of "+targetPrice+" (Target Price): "+occurencesTime);
    
        // Step 9: Cumulative Sum Computation for ArrayList
        // Compute cumulative sum for the ArrayList and print the result
        ArrayList<Float> cumulativeSumArrayList = stockProcessor.computeCumulativeSum(openingPricesList);
        System.out.println("Cumulative Sum ArrayList: "+cumulativeSumArrayList);
    
    }

}


/**
 * Step 10: StockProcessor Class
 * 
 * The StockProcessor class contains methods for processing stock data.
 */

 
 class StockProcessor {
/**
* Step 11: Calculate Average Stock Price method
* 
* Calculates the average stock price from array of stock prices.
* @param pricesArray Array of stock prices.
* @return Average stock price.
*/

     public double calculateAveragePrice(float[] pricesArray){
        double sum = 0;

        //Iterate through each stock price to calculate the sum.
        for(float price: pricesArray){
            sum += price;
        }

        return sum/pricesArray.length;
     }

/**
* Step 12: Find Maximum Stock Price Method
*
* Finds the maximum stock price from an array of stock prices.
* @param pricesArray Array of stock price.
* @return Maximum stock price.
*/
    public float findMaximumPrice(float[] pricesArray){
        //Initialize maxPrice with the first element [0] of the array.
        float maxPrice = pricesArray[0];

        //Iterate through each stock price to find the maxPrice
        for(float price: pricesArray){
            if(price > maxPrice){
                maxPrice = price;
            }
        }
        // Return the maximum stock price
        return maxPrice;
    }


/**
* Step 13: Count Occurrences Method
*
* Counts the occurrences of a specific stock price in an array.
*
* @param pricesArray Array of stock prices.
* @param targetPrice Stock price to count occurrences of.
* @return Number of occurrences of the target price.
*/

public int countOccurences(float[] pricesArray, float targetPrice ){
    int count = 0;

    //Iterate through each stock price to count occurences of target price.
    for(float price : pricesArray){
        if(price == targetPrice){
            count++;
        }
    }

    // Return the count of occurences
    return count;
}

/**
* Step 14: Compute Cumulative Sum Method
*
* Computes the cumulative sum of stock prices for an ArrayList.
*
* @param pricesList ArrayList of stock prices.
* @return ArrayList containing cumulative sum of prices at each position.
*/

public ArrayList<Float> computeCumulativeSum(ArrayList<Float> priceList){
    ArrayList<Float> cumulativeSumList = new ArrayList<>();
    float sum = 0;

    //Iterate through each stock price in the ArrayList.
    for(float price: priceList){
        // Update the sum and add it to the cumulativeSumList ArrayList.
        sum += price;
        cumulativeSumList.add(sum); 
    }

    // Return the ArrayList containing cumulative sum.
    return cumulativeSumList;
}

}
