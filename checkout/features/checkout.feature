Feature: checkout
	Scenario: checkout a banana	
		Given price of "banana" is 40c
		When I checkout 1 "banana"
		Then total price of "banana" should be 40c