This project takes environmental data given by a client through a json file, which in this case is the CCT Waste Minimisation Program,
and saves the data in an SQL (H2-database) table which can then be queried. The existing data, which was loaded into the database
from the json file, is then accessed using a series of get requests allowing the client to filter through and view the data as well
as add, update and delete data if adjustments need to be made.

The initial table data is based on the graph (seen below) which shows a record of 3 types of waste that the CCT Waste Minimisation Program has 
collected over a 5 year period (2016 - 2020)
![CCT Waste Minimisation Programme Graph](https://github.com/J4d4-M4thele/Environmental-Data-REST-API-Service/assets/102987102/7b39e8ae-4ac4-4335-a9c2-a683cc1e4df5)

Another feature of this REST API Service is that the H2-Database table can be queried to find the averages for each type of waste
that was collected over the duration of the CCT program. This can be done by running the 3 commands in the AverageQueries.sql file in the
H2-Database table's SQL Statement block. The results that are found when running these commands are displayed visually in the graph below.
![Average Waste Collection Amount](https://github.com/J4d4-M4thele/Environmental-Data-REST-API-Service/assets/102987102/7d355afe-7b69-4bfa-898a-20ff577ba90b)
