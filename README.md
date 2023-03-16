# 407-ETR-Code-exercise

In order to test this you need a Postman for below End Point Urls
=======================================================================================================
End Point URL to load the data into system to caluculate CostOfTrip

Its a POST Request

http://localhost:8080/loaddata

copy and paste the content of Interchanges in postman in Body => raw => JSON as a post request

======================================================================================================
Its a GET Request

http://localhost:8080/costoftrip

copy and paste the below requests in postman in Body => raw => JSON as a get request

Request Payload 1
{
    "startName": "Salem Road", 
    "endName": "QEW"
}

Response 1
{
    "distance": 107.96400000000001,
    "cost": 26.991000000000003
}

==================================================================================================

http://localhost:8080/costoftrip

Request 2

{
    "startName": "QEW", 
    "endName": "Salem Road"
}

Response 2

{
    "distance": 115.27700000000002,
    "cost": 28.819250000000004
}

=================================================================================================

http://localhost:8080/costoftrip

Request 3

{
    "startName": "Highway 400", 
    "endName": "QEW"
}

Response 3

{
    "distance": 67.74799999999999,
    "cost": 16.936999999999998
}

================================================================================================

http://localhost:8080/costoftrip

Request 4

{
    "startName": "QEW", 
    "endName": "Highway 400"
}

Response 4

{
    "distance": 68.93,
    "cost": 17.2325
}

==============================================================================================

To get the toll list with ID and Name

http://localhost:8080/tolls

{
    "Dundas Street": "2",
    "QEW": "1",
    "Dufferin Street": "28",
    "Kennedy Road": "36",
    "Salem Road": "46",
    "Appleby Line": "3",
    "Airport Road": "17",
    "Ninth Line": "39",
    "Warden Avenue": "35",
    "Hurontario": "13",
    "Brock Road": "44",
    "Bronte Road": "4",
    "Neyagawa Blvd.": "5",
    "Bayview Avenue": "31",
    "Mavis Road": "12",
    "Highway 410": "14",
    "Mississauga Road": "11",
    "Weston Road": "23",
    "Westney Road": "45",
    "Derry Road": "9",
    "Jane Street": "25",
    "Donald Cousens Pkwy": "40",
    "Bramalea Road": "16",
    "Pine Valley Drive": "22",
    "Highway 27": "20",
    "Dixie Road": "15",
    "Keele Street": "26",
    "Leslie Street": "32",
    "York Durham Line": "41",
    "Goreway Drive": "18",
    "Bathurst Street": "29",
    "Sideline 22": "43",
    "McCowan Road": "37",
    "Yonge Street": "30",
    "Woodbine Avenue": "34",
    "Sideline 26": "42",
    "Highway 400": "24",
    "Highway 401": "10",
    "Highway 403": "7",
    "Britannia Road": "8",
    "Highway 404": "33",
    "Trafalgar Road": "6",
    "Highway 427": "19",
    "Markham Road": "38"
}