-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('客户询价', '3', '1', '/system/customer', 'C', '0', 'system:customer:view', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '客户询价菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu  (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('客户询价查询', @parentId, '1',  '#',  'F', '0', 'system:customer:list',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('客户询价新增', @parentId, '2',  '#',  'F', '0', 'system:customer:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('客户询价修改', @parentId, '3',  '#',  'F', '0', 'system:customer:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('客户询价删除', @parentId, '4',  '#',  'F', '0', 'system:customer:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('客户询价导出', @parentId, '5',  '#',  'F', '0', 'system:customer:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');
