/**
 * Step 1: StockAnalyzer Class
 * 
 * The StockAnalysisApp class is the main class that initiates stock data analysis.
 */


import java.util.ArrayList;

public class StockAnalyzer {
    
    /*
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
        System.out.println("Average Opening Stock price: "+averagePrice);
     }

}


/**
 * Step 10: StockProcessor Class
 * 
 * The StockProcessor class contains methods for processing stock data.
 */

 /**
  * StockProcessor
  */
 class StockProcessor {

    /*
     * Step 11: Calculate Average Stock Price method
     * 
     * Calculates the average stock price from array of stock prices.
     */

     public double calculateAveragePrice(float[] pricesArray){
        double sum = 0;

        //Iterate through each stock price to calculate the sum.
        for(float price: pricesArray){
            sum += price;
        }

        return sum/pricesArray.length;
     }
    
 }
