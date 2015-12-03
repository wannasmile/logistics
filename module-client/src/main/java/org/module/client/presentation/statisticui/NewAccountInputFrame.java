package org.module.client.presentation.statisticui;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.module.client.vo.AccountVO;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NewAccountInputFrame extends JFrame {

	
	private static final long serialVersionUID = -3697163986008394972L;
	private JPanel contentPane;
	private JTextField id;
	private JTextField money;
	private JButton comfirm;
	private JButton cancel;

	
	public NewAccountInputFrame() {
		init();
		addListeners();
	}
	public NewAccountInputFrame(AccountVO vo) {
		init();
		addListeners();
		this.id.setText(vo.getId());
		this.money.setText(vo.getMoney()+"");
	}
	private void addListeners() {
		cancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});		
	}

	private void init(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("state");
		lblNewLabel.setFont(new Font("楷体", Font.PLAIN, 14));
		lblNewLabel.setBounds(184, 10, 54, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("账户");
		lblNewLabel_1.setFont(new Font("楷体", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(74, 47, 37, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("余额");
		label.setFont(new Font("楷体", Font.PLAIN, 15));
		label.setBounds(74, 80, 37, 23);
		contentPane.add(label);
		
		id = new JTextField();
		id.setFont(new Font("楷体", Font.PLAIN, 15));
		id.setBounds(133, 48, 263, 21);
		contentPane.add(id);
		id.setColumns(10);
		
		money = new JTextField();
		money.setFont(new Font("楷体", Font.PLAIN, 15));
		money.setColumns(10);
		money.setBounds(133, 81, 263, 21);
		contentPane.add(money);
		
		comfirm = new JButton("确定");
		comfirm.setFont(new Font("方正舒体", Font.PLAIN, 15));
		comfirm.setBounds(128, 149, 64, 23);
		contentPane.add(comfirm);
		
		cancel = new JButton("取消");
		cancel.setFont(new Font("方正舒体", Font.PLAIN, 15));
		cancel.setBounds(221, 150, 64, 23);
		contentPane.add(cancel);
	}
	
	public AccountVO getAccountVO() {
		return new AccountVO(this.id.getText(),this.money.getText());
	}
	
	public String getId() {
		return id.getText();
	}
	public String getMoney() {
		return money.getText();
	}
	public JButton getComfirm() {
		return comfirm;
	}
}
