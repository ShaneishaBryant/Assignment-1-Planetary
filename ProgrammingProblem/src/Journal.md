How did you handle the input for the user’s name and the planet’s name? Did you encounter any issues with the Scanner?


For the user's and plant name, I created separate variables to store the user's response. I used the 'sout' method to print out the response. 
I didn't encounter any issues with the scanner. When I began typing 'scanner' the system auto imported the scanner package.  

------

Explain the logic you used to determine if a planet is “Hazardous.” Why did you choose that specific conditional structure?

I was experiencing issues using nextInt() to get the temperature at first. However, after reading a helpful article that recommended using nextLine() with the Scanner variable, I resolved the issue. I then used an if-else statement to set my specific conditions. I also used the || (logical OR) operator to combine both conditions (temp > 100 || temp < -50), which helped keep my code short.


______


How do you think using a switch might make this more easy or difficult?

Using a switch statement made organizing my code much easier. It provided a clean, structured way to compare discrete values compared to writing a long chain of conditions.