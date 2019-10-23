package com.BridgeLabz.LogicalPrograms;

import java.util.Random;

import com.BridgeLabz.utility.Util;

/**
 * @author Sourabh Magdum
 * @Purpose - Tic-Tac-Toe game
 */
public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][]=new int[3][3];
		Random random = new Random();
		
		//int flag=0;
		mat=intialize(mat);

		int ri,rj;
		int mi,mj;
		mi=mj=5;
//The Game Begins
		while(check(mat)==0)
		{
			//computer chance is 1st
			ri=random.nextInt(3);
			rj=random.nextInt(3);
			if(mat[ri][rj]==-1)//if place is empty
			{
				mat[ri][rj]=0;
				display(mat);
				if(checkwinner(mat)!=2)
				{
					if(checkwinner(mat)==0)
					System.out.println("Comp   wins.... ");
					if(checkwinner(mat)==1)
					System.out.println("User   wins.... ");					
					break;
				}	
				mi=mj=5;
				while((mi>2 || mj>2) && checkplace(mat,mi,mj)!=1)
				{
				System.out.println("Enter the correct row & column:");
				mi=Util.readInt();
				
				mj=Util.readInt();
				}
				
					mat[mi][mj]=1;
					display(mat);
					
				
				
			}//end of outermost if
			
			if(checkwinner(mat)!=2)
			{
				if(checkwinner(mat)==0)
				System.out.println("Comp   wins.... ");
				if(checkwinner(mat)==1)
				System.out.println("User   wins.... ");					
				break;
			}//end of if
			
		}//end of while
		
	}//end of function

	private static int checkwinner(int[][] mat) {
		// TODO Auto-generated method stub
		int i,j;
		int winner=2;
		//checking for computer and user
		for(j=0;j<2;j++)
		{
				for(i=0;i<3;i++)
				{
					if( (mat[i][0]==j && mat[i][1]==j) && mat[i][2]==j)//checking for rows
						{winner=j;break;}
					if( (mat[0][i]==j && mat[1][i]==j) && mat[2][i]==j)//checking for coloumns
						{winner=j;break;}
						
				}
					if((mat[0][0]==j && mat[1][1]==j) && mat[2][2]==j)//checking diagonal
					{winner=j;break;}
					if((mat[0][2]==j && mat[1][1]==j) && mat[2][0]==j)//checking diagonal
					{winner=j;break;}				
		//checking for user
		}		
		
		return winner;
	}

	private static int checkplace(int[][] mat, int mi, int mj) {
		// TODO Auto-generated method stub
		int flag=0;
		if(mi<3 && mj<3)
		{
			if(mat[mi][mj]==-1)
			flag=1;
		}	
		
		return flag;
	}

	private static int check(int[][] mat) {
		// TODO Auto-generated method stub
		int i,j = 0;
		boolean flag=false;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(mat[i][j]==-1)
				flag=true;
				break;
			}
			if(flag==true)
			break;
		}
		if(i==3 && j==3)
		return 1;
		else
		return 0;
	}

	private static void display(int[][] mat) {
		// TODO Auto-generated method stub
		int i,j;
		System.out.println();
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(mat[i][j]!=-1)
				System.out.print("  "+mat[i][j]);
				else
				System.out.print("  - ");	
			}
			System.out.println();
		}
	}

	private static int [][] intialize(int[][] mat) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				mat[i][j]=-1;
			}
		}
		return mat;
	}//end of initialize;


}
