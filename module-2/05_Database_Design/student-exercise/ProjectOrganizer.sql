insert into transfers (transfer_type_id, transfer_status_id, account_from, account_to, amount) values (2, 2, 2, 1, 100.25);

select * from accounts where account_id = 4;

select * from transfers where account_from = 3 or account_to = 3;

select * from transfers
join users on account_from = user_id or account_to = user_id
join transfer_types on transfers.transfer_type_id = transfer_types.transfer_type_id
join transfer_statuses on transfers.transfer_status_id = transfer_statuses.transfer_status_id
where transfer_id = 35;