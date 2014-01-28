Set7:
	1. The methods implemented in critter are act, getActors, getMoveLocations, processActors, selectMoveLocation, makeMove
	2.The basic actions of all critters are getActors, getMoveLocations, processActors, selectMoveLocation, makeMove
	3. Yes, if the Critter class has a different way of getting actors
	4. Critter could change its color to the actor. The actors could be destroyed by the critter. The actors change to the critter's color
	5. getMoveLocations- gets all empty locations around the critter. selectMoveLocation- randomly chosses one of the locations that getMoveLocations returned. makeMove- the critter is moved to the selected location
	6. Actor has a consturctor that Critter extends.  When the program is ran, super is called. 
Set8:
	1. ChamleonCritter overides the processActors and makeMove methods
	2. The ChameleonCritter does what it needs to move and then calls super in order to actually move
	3. Change makeMove so that the it places a flower
	4. ChameleonCritter gets Actors the same way getActors does so there is no need to overide it
	5. Actor contains getLocation
	6. The critter can call getGrid
Set9:
	1. CrabCritter processes actors the same way the Critter class does
	2. The getActors method only takes actors that are infront of the critter or to its front right/left
	3. getLocationsInDirection returns locations that the critter can then process
	4. (4,3) (4,4) (4,5)