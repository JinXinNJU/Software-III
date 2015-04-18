package gui.match.player;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.text.SimpleDateFormat;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import vo.MatchVO;

import javax.swing.SwingConstants;

public class MatchItemPanel extends JPanel {
	private static final long serialVersionUID = 8710772911966562176L;
	private MatchVO vo;
	private JLabel lbl_date;
	private JLabel lbl_host;
	private JLabel lbl_guest;
	private JLabel lbl_host_score;
	private JLabel lbl_guest_score;

	public MatchItemPanel() {
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		
		lbl_date = new JLabel();
		lbl_date.setFont(new Font("宋体", Font.PLAIN, 17));
		lbl_date.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_date.setAlignmentX(0.5f);
		add(lbl_date,BorderLayout.NORTH);
		
		JPanel pnl_team = new JPanel();
		pnl_team.setLayout(new GridLayout(1,3));
		lbl_host = new JLabel();
		lbl_host.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_host.setFont(new Font("Dialog", Font.BOLD, 40));
		lbl_guest = new JLabel();
		lbl_guest.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_guest.setFont(new Font("Dialog", Font.BOLD, 40));
		pnl_team.add(lbl_host);
		pnl_team.add(Box.createHorizontalGlue());
		pnl_team.add(lbl_guest);
		add(pnl_team);

		JPanel pnl_score = new JPanel();
		pnl_score.setLayout(new GridLayout(1,3));
		lbl_host_score = new JLabel();
		lbl_host_score.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_host_score.setFont(new Font("宋体", Font.PLAIN, 37));
		lbl_guest_score = new JLabel();
		lbl_guest_score.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_guest_score.setFont(new Font("宋体", Font.PLAIN, 37));
		pnl_score.add(lbl_host_score);
		JLabel label = new JLabel(":");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("宋体", Font.PLAIN, 37));
		pnl_score.add(label);
		pnl_score.add(lbl_guest_score);
		add(pnl_score,BorderLayout.SOUTH);
	}
	public MatchItemPanel(MatchVO vo){
		this();
		setMatchVO(vo);
	}
	
	public void setMatchVO(MatchVO vo){
		this.vo = vo;
		lbl_date.setText(new SimpleDateFormat("yyyy年MM月dd日").format(vo.getDay()));
		lbl_host.setText(vo.getTeam1().toString());
		lbl_guest.setText(vo.getTeam2().toString());
		String[] score = vo.getScore().split("-");
		lbl_host_score.setText(score[0]);
		lbl_guest_score.setText(score[1]);
	}

}