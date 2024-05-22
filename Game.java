import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class Game
{
	int score=0;
	int innings=1;
	int trgt=0;
	int gotresult=0;
	int won=0;
	int lost=0;
	Timer tm;
	public static void main(String args[])
	{
		Game g=new Game();
		g.firstWindow();
	}
	void firstWindow()
	{
		final JFrame frame1=new JFrame("Hand Cricket");
		JPanel jp1=new JPanel();
		jp1.setBackground(Color.orange);
		frame1.add(jp1);
		JLabel l1=new JLabel("Hand Cricket");
		jp1.add(l1);
		l1.setFont(new Font("Algerian",Font.BOLD,50));
		jp1.setLayout(new FlowLayout());
		JLabel l2=new JLabel("Odd or Even?");
		jp1.add(l2);
		l2.setFont(new Font("Algerian",Font.PLAIN,50));
		JButton b1=new JButton("Odd");
		jp1.add(b1);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				frame1.dispose();
				ch123(1);
			}
		});
		b1.setFont(new Font("Algerian",Font.PLAIN,70));
		JButton b2=new JButton("Even");
		jp1.add(b2);
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				frame1.dispose();
				ch123(2);
			}
		});
		b2.setFont(new Font("Algerian",Font.PLAIN,70));
		frame1.setSize(500,500);
		frame1.setVisible(true);
	}
	void ch123(final int a)
	{
		Random random=new Random();
		final int x=random.nextInt(3)+1;
		
		final JFrame frame2=new JFrame("Hand Cricket");
		JPanel jp2=new JPanel();
		jp2.setBackground(Color.orange);
		frame2.add(jp2);

		JLabel l3=new JLabel("Choose a number");
		jp2.add(l3);
		l3.setFont(new Font("Algerian",Font.PLAIN,50));

		JButton b4=new JButton("1");
		jp2.add(b4);
		b4.setFont(new Font("Algerian",Font.PLAIN,70));
		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JLabel cm=new JLabel("Computer's move:"+String.valueOf(x));
				jp2.add(cm);
				cm.setFont(new Font("Algerian",Font.PLAIN,40));
				tm = new Timer(1000, new ActionListener() {
			         public void actionPerformed(ActionEvent ae) {
			                  frame2.dispose();
			                  chkeveodd(a,x,1);
			         }
			      });
				tm.start();
			}
		});

		JButton b5=new JButton("2");
		jp2.add(b5);
		b5.setFont(new Font("Algerian",Font.PLAIN,70));
		b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JLabel cm=new JLabel("Computer's move:"+String.valueOf(x));
				jp2.add(cm);
				cm.setFont(new Font("Algerian",Font.PLAIN,40));
				tm = new Timer(1000, new ActionListener() {
			         public void actionPerformed(ActionEvent ae) {
			                  frame2.dispose();
			                  chkeveodd(a,x,2);
			         }
			      });
				tm.start();
			}
		});

		JButton b6=new JButton("3");
		jp2.add(b6);
		b6.setFont(new Font("Algerian",Font.PLAIN,70));
		b6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JLabel cm=new JLabel("Computer's move:"+String.valueOf(x));
				jp2.add(cm);
				cm.setFont(new Font("Algerian",Font.PLAIN,40));
				tm = new Timer(1000, new ActionListener() {
			         public void actionPerformed(ActionEvent ae) {
			                  frame2.dispose();
			                  chkeveodd(a,x,3);
			         }
			      });
				tm.start();
			}
		});

		frame2.setSize(500,500);
		frame2.setVisible(true);
		
	}
	void chkeveodd(int o,int e,int btn)
	{
		tm.stop();
		if(o==1)
		{
			if((e+btn)%2==0)
			{
				losetoss();
			}
			else
			{
				wintoss();
			}
		}
		else
		{
			if((e+btn)%2==0)
			{
				wintoss();
			}
			else
			{
				losetoss();
			}
		}
	}
	void wintoss()
	{
		final JFrame frame3= new JFrame("Hand Cricket");
		JPanel jp3= new JPanel();
		jp3.setBackground(Color.orange);
		frame3.add(jp3);
		jp3.setLayout(new FlowLayout());
		JLabel wint = new JLabel("You win the Toss");
		jp3.add(wint);
		wint.setFont(new Font("Algerian",Font.ITALIC,50));
		
		JButton bat=new JButton("BAT");
		bat.setFont(new Font("Algerian",Font.BOLD,40));
		jp3.add(bat);
		bat.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				frame3.dispose();
				play(1);
			}
		});
		JButton bowl=new JButton("BOWL");
		bowl.setFont(new Font("Algerian",Font.BOLD,40));
		jp3.add(bowl);
		bowl.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				frame3.dispose();
				play(0);
			}
		});
		frame3.setSize(500,500);
		frame3.setVisible(true);
	}
	void losetoss()
	{
		final JFrame frame4=new JFrame("Hand Cricket");
		JPanel jp4=new JPanel();
		jp4.setBackground(Color.orange);
		frame4.add(jp4);
		jp4.setLayout(new FlowLayout());
		JLabel losst=new JLabel("You lose the Toss");
		jp4.add(losst);
		losst.setFont(new Font("Algerian",Font.BOLD,40));
		Random random=new Random();
		final int x=random.nextInt(2)+1;
		if(x==1)
		{
			JLabel willbat=new JLabel("Computer will bat");
			jp4.add(willbat);
			willbat.setFont(new Font("Algerian",Font.PLAIN,40));
		}
		else
		{
			JLabel willbowl=new JLabel("Computer will bowl");
			jp4.add(willbowl);
			willbowl.setFont(new Font("Algerian",Font.PLAIN,40));
		}
		JButton play=new JButton("PLAY");
		jp4.add(play);
		play.setFont(new Font("Algerian",Font.BOLD,50));
		play.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				if(x==1)
				{
					frame4.dispose();
					play(0);
				}
				else
				{
					frame4.dispose();
					play(1);
				}
			}
		});
		frame4.setSize(500,500);
		frame4.setVisible(true);
	}
	void play(final int y) 
	{
		final JFrame frame5=new JFrame("Hand Cricket");
		JPanel jp5=new JPanel();
		jp5.setBackground(Color.orange);
		frame5.add(jp5);
		jp5.setLayout(new FlowLayout());
		
		if(y==1)
		{
			JLabel runs=new JLabel("How many runs you want to score");
			jp5.add(runs);
			runs.setFont(new Font("Algerian",Font.PLAIN,25));
		}
		else
		{
			JLabel runs=new JLabel("How do you face the batsman");
			jp5.add(runs);
			runs.setFont(new Font("Algerian",Font.PLAIN,30));
		}
		Random random=new Random();
		final int r=random.nextInt(5)+1;
		
		JButton run1=new JButton("1");
		jp5.add(run1);
		run1.setFont(new Font("Algerian",Font.PLAIN,70));
		run1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JLabel cm=new JLabel("Computer's move:"+String.valueOf(r));
				jp5.add(cm);
				cm.setFont(new Font("Algerian",Font.PLAIN,40));
				tm = new Timer(1000, new ActionListener() {
			         public void actionPerformed(ActionEvent ae) {
			                  frame5.dispose();
			                  chkwicket(1,r,y);
			         }
			      });
				tm.start();
			}
		});
		JButton run2=new JButton("2");
		jp5.add(run2);
		run2.setFont(new Font("Algerian",Font.PLAIN,70));
		run2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JLabel cm=new JLabel("Computer's move:"+String.valueOf(r));
				jp5.add(cm);
				cm.setFont(new Font("Algerian",Font.PLAIN,40));
				tm = new Timer(1000, new ActionListener() {
			         public void actionPerformed(ActionEvent ae) {
			                  frame5.dispose();
			                  chkwicket(2,r,y);
			         }
			      });
				tm.start();
			}
		});
		JButton run3=new JButton("3");
		jp5.add(run3);
		run3.setFont(new Font("Algerian",Font.PLAIN,70));
		run3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JLabel cm=new JLabel("Computer's move:"+String.valueOf(r));
				jp5.add(cm);
				cm.setFont(new Font("Algerian",Font.PLAIN,40));
				tm = new Timer(1000, new ActionListener() {
			         public void actionPerformed(ActionEvent ae) {
			                  frame5.dispose();
			                  chkwicket(3,r,y);
			         }
			      });
				tm.start();
			}
		});
		JButton run4=new JButton("4");
		jp5.add(run4);
		run4.setFont(new Font("Algerian",Font.PLAIN,70));
		run4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JLabel cm=new JLabel("Computer's move:"+String.valueOf(r));
				jp5.add(cm);
				cm.setFont(new Font("Algerian",Font.PLAIN,40));
				tm = new Timer(1000, new ActionListener() {
			         public void actionPerformed(ActionEvent ae) {
			                  frame5.dispose();
			                  chkwicket(4,r,y);
			         }
			      });
				tm.start();
			}
		});
		JButton run5=new JButton("5");
		jp5.add(run5);
		run5.setFont(new Font("Algerian",Font.PLAIN,70));
		run5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JLabel cm=new JLabel("Computer's move:"+String.valueOf(r));
				jp5.add(cm);
				cm.setFont(new Font("Algerian",Font.PLAIN,40));
				tm = new Timer(1000, new ActionListener() {
			         public void actionPerformed(ActionEvent ae) {
			                  frame5.dispose();
			                  chkwicket(5,r,y);
			         }
			      });
				tm.start();
			}
		});
		JLabel scr=new JLabel("Score:"+String.valueOf(score));
		jp5.add(scr);
		scr.setFont(new Font("Algerian",Font.BOLD,50));
		frame5.setSize(500,500);
		frame5.setVisible(true);
	}
	void chkwicket(int p,int q,final int r)
	{
		tm.stop();
		if(p==q)
		{
			if(innings==1)
			{
				final JFrame frame6=new JFrame("Hand Cricket");
				JPanel jp6=new JPanel();
				jp6.setBackground(Color.orange);
				frame6.add(jp6);
				jp6.setLayout(new FlowLayout());
				JLabel wicket=new JLabel("WICKET!!");
				jp6.add(wicket);
				wicket.setFont(new Font("Algerian",Font.PLAIN,50));
				JLabel target=new JLabel("Target:"+String.valueOf(score+1));
				jp6.add(target);
				target.setFont(new Font("Algerian",Font.BOLD,70));
				innings=2;
				trgt=score+1;
				score=0;
				JButton cntue=new JButton("CONTINUE");
				jp6.add(cntue);
				cntue.setFont(new Font("Algerian",Font.PLAIN,50));
				cntue.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e)
					{
						if(r==1)
						{
							frame6.dispose();
							play(0);
						}
						else
						{
							frame6.dispose();
							play(1);
						}
					}
				});
				frame6.setSize(500,500);
				frame6.setVisible(true);
			}
			else
			{
				if(r==1)
				{
					lost=1;
					
				}
				else
				{
					won=1;
				}
				gotresult=1;
			}
		}
		else
		{
			if(r==1)
			{
				score+=p;
				if(innings==2 && score>=trgt)
				{
					won=1;
					gotresult=1;
				}
				else
				{
					play(1);
				}
			}
			else
			{
				score+=q;
				if(innings==2 && score>=trgt)
				{
					lost=1;
					gotresult=1;
				}
				else
				{
					play(0);
				}
			}
		}
		if (gotresult==1)
		{
			final JFrame frame6=new JFrame("Hand Cricket");
			JPanel jp6=new JPanel();
			jp6.setBackground(Color.orange);
			frame6.add(jp6);
			jp6.setLayout(new FlowLayout());
			if(won==1)
			{
				JLabel wongame=new JLabel("You Won the Match!!");
				jp6.add(wongame);
				wongame.setFont(new Font("Algerian",Font.BOLD,40));
			}
			else if(lost==1)
			{
				JLabel lostgame=new JLabel("You Lost the Match");
				jp6.add(lostgame);
				lostgame.setFont(new Font("Algerian",Font.BOLD,40));
			}
			JButton newgame=new JButton("Play Again");
			jp6.add(newgame);
			newgame.setFont(new Font("Algerian",Font.PLAIN,60));
			newgame.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
					score=0;
					innings=1;
					gotresult=0;
					won=0;
					lost=0;
					frame6.dispose();
					firstWindow();
				}
			});
			JButton quit=new JButton("Quit");
			jp6.add(quit);
			quit.setFont(new Font("Algerian",Font.PLAIN,60));
			quit.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
					frame6.dispose();
				}
			});
			frame6.setSize(500,500);
			frame6.setVisible(true);
		}
	}
}




