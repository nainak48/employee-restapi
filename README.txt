###############################################
Find all Employee:
###############################################
url : http://localhost:8090/employee
Request method : GET,
Response : 
[
    {
        "empId": 1,
        "empName": "naina",
        "empDsgn": "Manager",
        "empSalary": 3000
    },
    {
        "empId": 2,
        "empName": "nk",
        "empDsgn": "Tech lead",
        "empSalary": 1000.99
    }
]


###############################################
Add new Employee:
###############################################
url : http://localhost:8090/employee/
Request method : POST,
payload : 
	{
		"empId":1,
		"empName":"naina",
		"empDsgn":"Manager",
		"empSalary":3000
	}
Response : []



###############################################
Update existing Employee:
###############################################
url : http://localhost:8090/employee/1
Request method : PUT,
payload : 
	{
	 	"empId":1,
		"empName":"nainaaaa",
		"empDsgn":"Tech lead",
		"empSalary":99999.99
	}
Response : []



###############################################
Delete existing Employee:
###############################################
url : http://localhost:8090/employee/1/
Request method : DELETE,
Response : []



###############################################
Find address details of Employee by empID
###############################################
url : http://localhost:8090/employee/1/address
Request method : GET,
Response : []



###############################################
Add an address for Employee
###############################################
url : http://localhost:8090/employee/1/address
Request method : POST,
payload : 
	{ 
		"addrId" : 1,
		"street":"pipkin",
		"city": "coventry",
		"postalCode": "cv12ug"
	}
Response : []



###############################################
Update existing Address:
###############################################
url : http://localhost:8090/employee/1/address/1
Request method : PUT,
payload : 
	{ 
		"addrId" : 1,
		"street":"court",
		"city": "coventry",
		"postalCode": "cv12ug"
	}
Response : []



###############################################
Delete existing address:
###############################################
url : http://localhost:8090/employee/1/address/1
Request method : DELETE,
Response : []
	

	