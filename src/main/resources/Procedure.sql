CREATE DEFINER=`root`@`localhost` PROCEDURE `insert_employee`(
    IN empname VARCHAR(100),
    IN dept VARCHAR(100),
    IN designation VARCHAR(100),
    IN email VARCHAR(100),
    IN salary DOUBLE
)
BEGIN
    INSERT INTO employees(empname, dept, designation, email, salary)
    VALUES (empname, dept, designation, email, salary);
END