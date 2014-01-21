package TwoDController;

import TwoDView.TwoDView;

public class TwoDController
{
	//Declaration Section //
	
	private String[][] friendsNames;
	private int[][] friendsAges;
	private TwoDView consoleView;
	private String[][] myHipsters;
	
	public TwoDController()
	{
		friendsNames = new String[4][4];
		friendsAges = new int [4][4];
		myHipsters = new String [5][5];
		
		consoleView = new TwoDView();
	}
	
	public int[][] getMyFriendsAges()
	{
		return friendsAges;
	}
	public String[][] getFriendsNames()
	{
		return friendsNames;
	}
	public void setFriendsAges(int[][] myFriendAges)
	{
		this.friendsAges = myFriendAges;
	}
	public void setFriendsNames(String[][] friendNames)
	{
		this.friendsNames = friendNames;
	}	
	public String [][] getMyHipsters() 
	{
		return myHipsters;
	}
	public void setMyHipsters(String [][] myHipsters) 

	{
		this.myHipsters = myHipsters;
	}

	
	
	public void fillAges()
	{
		friendsAges[0][0] =16;
		friendsAges[0][1] =17;
		friendsAges[0][2] =16;
		friendsAges[0][3] =25;
	}
	public void fillNames()
	{
		friendsNames[0][0] = "Levi";
		friendsNames[1][0] = "Kyler";
		friendsNames[2][0] = "Mikel";
		friendsNames[3][0] = "Allen";
	}
	public void fillHipsterObject()
	{
		myHipsters[0][1] = "Lamborghini Adventador";
		myHipsters[0][2] = "Nissan GTR w/ Liberty Walk";
		myHipsters[0][3] = "Ferrari 458 Italia";
		myHipsters[0][4] = "Maserati Gran Turismo";
	}
	public void start()
	{
		fillAges();
		fillNames();
		fillHipsterObject();
		consoleView.printStringInformation(friendsNames);
	}
}
