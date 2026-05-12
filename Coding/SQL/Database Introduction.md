---
base: "[[CODE Materials.base]]"
Class: SQL Fundamentals
Description: ""
Created: 2025-10-08T20:11:00
---
### 

### **Database - Cơ sở dữ liệu là gì?**
- Cơ sở dữ liệu là một tập dữ liệu được sắp xếp, lưu trữ và quản lý một cách có hệ thống.


### DBMS - Hệ thống quản lý cơ sở dữ liệu
- Các phần mềm quản lý cơ sở dữ liệu: MySQL, PostgreSQL, SQL Server, Oracle, MongoDB.
- Các loại cơ sở dữ liệu:
    - Cơ sở dữ liệu quan hệ (RDBMS): Dữ liệu được lưu trữ trong các bảng có cấu trúc (dựa trên SQL)
    - Cơ sở dữ liệu NoSQL: Dữ liệu được lưu trữ dưới dạng JSON, key-value, tài liệu (bán cấu trúc hoặc phi cấu trúc)


### Data
- Dữ liệu là các mẩu thông tin cần phải được xử lí hoặc phân tích.
- Các loại dữ liệu:
    - Dữ liệu cấu trúc: dữ liệu được sắp xếp và lưu trữ với một format có sẵn (bảng,…)
    - Dữ liệu không cấu trúc: dữ liệu không có format cố định (ảnh, video, nhạc,…)
    - Dữ liệu bán cấu trúc: dữ liệu được bán sắp xếp, sử dụng tag hoặc metadata (JSON, XML)


### Key Concepts - Các định nghĩa quan trọng
- Table: Bảng dùng để chứa các dữ liệu đã sắp xếp
- Row (Record): Các hàng trong một bảng, dùng để lưu trữ 1 bản ghi
- Column (Field): Các cột thể hiện các thuộc tính của dữ liệu
- Primary Key: Dùng để định danh một bản ghi duy nhất
- Foreign Key: Dùng đề liên đới tới PK


![[image 4.png]]

# ERD - ENTITY-RELATIONSHIP DIAGRAM

What is ERD?
An Entity-Relationship Diagram (ERD) is a visual representation of data and the relationships between different entities in a database. It is used in database design to help structure and organize data before implementing it in a database management system (DBMS).
Key Components of an ERD:
1. Entities – Objects or concepts that store data (e.g., "Customer", "Order").
2. Attributes – Characteristics or properties of an entity (e.g., "Customer Name", "Order Date").
3. Relationships – The connections between entities, showing how they interact (e.g., "Customer places Order").
4. Primary Keys – Unique identifiers for each entity (e.g., "Customer ID").
5. Foreign Keys – Attributes that link one entity to another.

▪ Example of an ERD: A simple ERD for an Online Shopping System may include:
   ✓ Entities: Customer, Order, Product
   ✓ Relationships:
      • A Customer places multiple Orders
      • An Order contains multiple Products
      • A Product can be in multiple Orders









