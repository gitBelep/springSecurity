insert into users(username, password, enabled)
values('user2', '$2a$10$KSTXU62vJ27z7pEiyhcDfOQP1vT1mmJQ4XmEWOpX0EbtOB8wFEyru', true);

insert into authorities(username, authority)
values('user2', 'normal_user');