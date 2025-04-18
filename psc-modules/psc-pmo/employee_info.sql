/*
 Navicat Premium Dump SQL

 Source Server         : AI-HR
 Source Server Type    : PostgreSQL
 Source Server Version : 170000 (170000)
 Source Host           : 172.31.2.165:5432
 Source Catalog        : psc
 Source Schema         : public

 Target Server Type    : PostgreSQL
 Target Server Version : 170000 (170000)
 File Encoding         : 65001

 Date: 17/04/2025 15:43:26
*/


-- ----------------------------
-- Table structure for employee_contact
-- ----------------------------
DROP TABLE IF EXISTS "public"."employee_contact";
CREATE TABLE "public"."employee_contact" (
  "employee_id" int4 NOT NULL,
  "business_email" varchar(20) COLLATE "pg_catalog"."default",
  "address" varchar(200) COLLATE "pg_catalog"."default",
  "person_email" varchar(20) COLLATE "pg_catalog"."default",
  "phone_list" json,
  "emergency_contact_list" json
)
;

-- ----------------------------
-- Table structure for employee_education
-- ----------------------------
DROP TABLE IF EXISTS "public"."employee_education";
CREATE TABLE "public"."employee_education" (
  "employee_id" int4 NOT NULL,
  "degree" varchar(50) COLLATE "pg_catalog"."default",
  "university" varchar(255) COLLATE "pg_catalog"."default",
  "major" varchar(255) COLLATE "pg_catalog"."default",
  "start_date" date,
  "graduation_date" date,
  "educational_form" varchar(255) COLLATE "pg_catalog"."default",
  "first_degree" varchar(50) COLLATE "pg_catalog"."default",
  "first_degree_university" varchar(255) COLLATE "pg_catalog"."default",
  "first_degree_major" varchar(255) COLLATE "pg_catalog"."default",
  "first_degree_graduation_date" date
)
;

-- ----------------------------
-- Table structure for employee_emergency_contact
-- ----------------------------
DROP TABLE IF EXISTS "public"."employee_emergency_contact";
CREATE TABLE "public"."employee_emergency_contact" (
  "id" int4 NOT NULL DEFAULT nextval('employee_emergency_contact_id_seq'::regclass),
  "employee_id" int4,
  "name" varchar(255) COLLATE "pg_catalog"."default",
  "relation" varchar(50) COLLATE "pg_catalog"."default",
  "phone" varchar(50) COLLATE "pg_catalog"."default",
  "email" varchar(50) COLLATE "pg_catalog"."default",
  "is_primary" char(1) COLLATE "pg_catalog"."default"
)
;

-- ----------------------------
-- Table structure for employee_ext_ant
-- ----------------------------
DROP TABLE IF EXISTS "public"."employee_ext_ant";
CREATE TABLE "public"."employee_ext_ant" (
  "employee_id" int4 NOT NULL,
  "ant_employee_id" varchar(50) COLLATE "pg_catalog"."default",
  "mentor" varchar(255) COLLATE "pg_catalog"."default",
  "senior" varchar(255) COLLATE "pg_catalog"."default",
  "l1_pass_date" date,
  "current_project" varchar(255) COLLATE "pg_catalog"."default",
  "current_domain" varchar(255) COLLATE "pg_catalog"."default",
  "historical_domain" varchar(255) COLLATE "pg_catalog"."default",
  "city" varchar(255) COLLATE "pg_catalog"."default",
  "outsourced_position" varchar(255) COLLATE "pg_catalog"."default",
  "outsourced_duties" text COLLATE "pg_catalog"."default",
  "job_role" varchar(255) COLLATE "pg_catalog"."default",
  "job_grade" varchar(255) COLLATE "pg_catalog"."default",
  "contract_form" varchar(255) COLLATE "pg_catalog"."default",
  "ant_email" varchar(255) COLLATE "pg_catalog"."default",
  "remarks" text COLLATE "pg_catalog"."default"
)
;

-- ----------------------------
-- Table structure for employee_ext_dbs
-- ----------------------------
DROP TABLE IF EXISTS "public"."employee_ext_dbs";
CREATE TABLE "public"."employee_ext_dbs" (
  "employee_id" int4 NOT NULL,
  "dbs_employee_id" varchar(50) COLLATE "pg_catalog"."default",
  "dbs_email" varchar(255) COLLATE "pg_catalog"."default",
  "source" varchar(50) COLLATE "pg_catalog"."default",
  "company" varchar(100) COLLATE "pg_catalog"."default",
  "project_code" varchar(50) COLLATE "pg_catalog"."default",
  "work_location" varchar(100) COLLATE "pg_catalog"."default",
  "sow_location" varchar(100) COLLATE "pg_catalog"."default",
  "lobt" varchar(50) COLLATE "pg_catalog"."default",
  "lobt_group" varchar(50) COLLATE "pg_catalog"."default",
  "sow" varchar(100) COLLATE "pg_catalog"."default",
  "job_role" varchar(255) COLLATE "pg_catalog"."default",
  "job_grade" varchar(255) COLLATE "pg_catalog"."default",
  "ncs_grade" varchar(50) COLLATE "pg_catalog"."default",
  "yeas_of_service" varchar(5) COLLATE "pg_catalog"."default",
  "dbs_service_period" varchar(5) COLLATE "pg_catalog"."default",
  "skillset" text COLLATE "pg_catalog"."default",
  "hiring_manager" varchar(255) COLLATE "pg_catalog"."default",
  "specialization" varchar(255) COLLATE "pg_catalog"."default",
  "dbs_rate_card" numeric(10,2),
  "beeline_status" varchar(50) COLLATE "pg_catalog"."default"
)
;

-- ----------------------------
-- Table structure for employee_job
-- ----------------------------
DROP TABLE IF EXISTS "public"."employee_job";
CREATE TABLE "public"."employee_job" (
  "employee_id" int4,
  "employee_status" varchar(50) COLLATE "pg_catalog"."default",
  "country" varchar(50) COLLATE "pg_catalog"."default",
  "direct_manager" varchar(100) COLLATE "pg_catalog"."default",
  "project_manager" varchar(100) COLLATE "pg_catalog"."default",
  "job_title" varchar(100) COLLATE "pg_catalog"."default",
  "tech_group" varchar(100) COLLATE "pg_catalog"."default",
  "job_profile_start_date" date,
  "entry_grade" varchar(50) COLLATE "pg_catalog"."default",
  "job_grade" varchar(50) COLLATE "pg_catalog"."default",
  "employee_subgroup" varchar(50) COLLATE "pg_catalog"."default",
  "chn_employee_subgroup_category" varchar(50) COLLATE "pg_catalog"."default",
  "work_schedule_rule" varchar(100) COLLATE "pg_catalog"."default",
  "standard_weekly_hours" numeric(3,1),
  "working_days_per_week" int4,
  "fte" numeric(3,2)
)
;

-- ----------------------------
-- Table structure for employee_more_info
-- ----------------------------
DROP TABLE IF EXISTS "public"."employee_more_info";
CREATE TABLE "public"."employee_more_info" (
  "employee_id" int4 NOT NULL,
  "work_start_date" date,
  "it_work_start_date" date,
  "hobby" varchar(255) COLLATE "pg_catalog"."default",
  "skill_set" varchar(255) COLLATE "pg_catalog"."default",
  "remark" varchar(255) COLLATE "pg_catalog"."default"
)
;

-- ----------------------------
-- Table structure for employee_national
-- ----------------------------
DROP TABLE IF EXISTS "public"."employee_national";
CREATE TABLE "public"."employee_national" (
  "id" int4 NOT NULL DEFAULT nextval('employee_national_id_seq'::regclass),
  "employee_id" int4,
  "country" varchar(255) COLLATE "pg_catalog"."default",
  "type" varchar(50) COLLATE "pg_catalog"."default",
  "id_no" varchar(50) COLLATE "pg_catalog"."default",
  "acquired_date" date,
  "is_primary" char(1) COLLATE "pg_catalog"."default"
)
;

-- ----------------------------
-- Table structure for employee_offboarding
-- ----------------------------
DROP TABLE IF EXISTS "public"."employee_offboarding";
CREATE TABLE "public"."employee_offboarding" (
  "employee_id" int4 NOT NULL,
  "offboard_date" date,
  "offboard_month" int4,
  "reason" varchar(255) COLLATE "pg_catalog"."default",
  "rehire_status" varchar(50) COLLATE "pg_catalog"."default",
  "ok_to_rehire" bool
)
;

-- ----------------------------
-- Table structure for employee_payment
-- ----------------------------
DROP TABLE IF EXISTS "public"."employee_payment";
CREATE TABLE "public"."employee_payment" (
  "id" int4 NOT NULL DEFAULT nextval('employee_payment_id_seq'::regclass),
  "employee_id" int4,
  "bank" varchar(50) COLLATE "pg_catalog"."default",
  "account_name" varchar(255) COLLATE "pg_catalog"."default",
  "account_no" varchar(50) COLLATE "pg_catalog"."default"
)
;

-- ----------------------------
-- Table structure for employees
-- ----------------------------
DROP TABLE IF EXISTS "public"."employees";
CREATE TABLE "public"."employees" (
  "employee_id" int4 NOT NULL DEFAULT nextval('employees_employee_id_seq'::regclass),
  "employee_code" varchar(50) COLLATE "pg_catalog"."default",
  "type" int2,
  "name" varchar(200) COLLATE "pg_catalog"."default",
  "chinese_name" varchar(20) COLLATE "pg_catalog"."default",
  "english_name" varchar(200) COLLATE "pg_catalog"."default",
  "first_name" varchar(100) COLLATE "pg_catalog"."default",
  "last_name" varchar(100) COLLATE "pg_catalog"."default",
  "gender" varchar(10) COLLATE "pg_catalog"."default",
  "date_of_birth" date,
  "nationality" varchar(50) COLLATE "pg_catalog"."default",
  "second_nationality" varchar(50) COLLATE "pg_catalog"."default",
  "ethnicity" varchar(50) COLLATE "pg_catalog"."default",
  "marital_status" varchar(50) COLLATE "pg_catalog"."default",
  "marital_status_effective_date" date,
  "has_children" bool,
  "identity_number" varchar(50) COLLATE "pg_catalog"."default",
  "identity_card_expiry" date,
  "passport_number" varchar(50) COLLATE "pg_catalog"."default",
  "hire_date" date,
  "original_hire_date" date,
  "seniority_start_date" date,
  "probation_end_date" date,
  "resignation_date" date,
  "status" varchar(50) COLLATE "pg_catalog"."default",
  "english_level" varchar(10) COLLATE "pg_catalog"."default"
)
;

-- ----------------------------
-- Primary Key structure for table employee_contact
-- ----------------------------
ALTER TABLE "public"."employee_contact" ADD CONSTRAINT "employee_contact_pkey" PRIMARY KEY ("employee_id");

-- ----------------------------
-- Primary Key structure for table employee_education
-- ----------------------------
ALTER TABLE "public"."employee_education" ADD CONSTRAINT "employee_education_pkey" PRIMARY KEY ("employee_id");

-- ----------------------------
-- Primary Key structure for table employee_emergency_contact
-- ----------------------------
ALTER TABLE "public"."employee_emergency_contact" ADD CONSTRAINT "employee_emergency_contact_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table employee_ext_ant
-- ----------------------------
ALTER TABLE "public"."employee_ext_ant" ADD CONSTRAINT "employee_ext_ant_pkey" PRIMARY KEY ("employee_id");

-- ----------------------------
-- Primary Key structure for table employee_ext_dbs
-- ----------------------------
ALTER TABLE "public"."employee_ext_dbs" ADD CONSTRAINT "employee_ext_dbs_pkey" PRIMARY KEY ("employee_id");

-- ----------------------------
-- Primary Key structure for table employee_more_info
-- ----------------------------
ALTER TABLE "public"."employee_more_info" ADD CONSTRAINT "employee_more_info_pkey" PRIMARY KEY ("employee_id");

-- ----------------------------
-- Primary Key structure for table employee_national
-- ----------------------------
ALTER TABLE "public"."employee_national" ADD CONSTRAINT "employee_national_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table employee_offboarding
-- ----------------------------
ALTER TABLE "public"."employee_offboarding" ADD CONSTRAINT "employee_offboarding_pkey" PRIMARY KEY ("employee_id");

-- ----------------------------
-- Primary Key structure for table employee_payment
-- ----------------------------
ALTER TABLE "public"."employee_payment" ADD CONSTRAINT "employee_payment_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table employees
-- ----------------------------
ALTER TABLE "public"."employees" ADD CONSTRAINT "employees_pkey" PRIMARY KEY ("employee_id");

-- ----------------------------
-- Foreign Keys structure for table employee_contact
-- ----------------------------
ALTER TABLE "public"."employee_contact" ADD CONSTRAINT "employee_contact_employee_id_fkey" FOREIGN KEY ("employee_id") REFERENCES "public"."employees" ("employee_id") ON DELETE CASCADE ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Keys structure for table employee_education
-- ----------------------------
ALTER TABLE "public"."employee_education" ADD CONSTRAINT "employee_education_employee_id_fkey" FOREIGN KEY ("employee_id") REFERENCES "public"."employees" ("employee_id") ON DELETE CASCADE ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Keys structure for table employee_emergency_contact
-- ----------------------------
ALTER TABLE "public"."employee_emergency_contact" ADD CONSTRAINT "employee_emergency_contact_employee_id_fkey" FOREIGN KEY ("employee_id") REFERENCES "public"."employees" ("employee_id") ON DELETE CASCADE ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Keys structure for table employee_ext_ant
-- ----------------------------
ALTER TABLE "public"."employee_ext_ant" ADD CONSTRAINT "employee_ext_ant_employee_id_fkey" FOREIGN KEY ("employee_id") REFERENCES "public"."employees" ("employee_id") ON DELETE CASCADE ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Keys structure for table employee_ext_dbs
-- ----------------------------
ALTER TABLE "public"."employee_ext_dbs" ADD CONSTRAINT "employee_ext_dbs_employee_id_fkey" FOREIGN KEY ("employee_id") REFERENCES "public"."employees" ("employee_id") ON DELETE CASCADE ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Keys structure for table employee_job
-- ----------------------------
ALTER TABLE "public"."employee_job" ADD CONSTRAINT "employee_job_employee_id_fkey" FOREIGN KEY ("employee_id") REFERENCES "public"."employees" ("employee_id") ON DELETE CASCADE ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Keys structure for table employee_more_info
-- ----------------------------
ALTER TABLE "public"."employee_more_info" ADD CONSTRAINT "employee_more_info_employee_id_fkey" FOREIGN KEY ("employee_id") REFERENCES "public"."employees" ("employee_id") ON DELETE CASCADE ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Keys structure for table employee_national
-- ----------------------------
ALTER TABLE "public"."employee_national" ADD CONSTRAINT "employee_national_employee_id_fkey" FOREIGN KEY ("employee_id") REFERENCES "public"."employees" ("employee_id") ON DELETE CASCADE ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Keys structure for table employee_offboarding
-- ----------------------------
ALTER TABLE "public"."employee_offboarding" ADD CONSTRAINT "employee_offboarding_employee_id_fkey" FOREIGN KEY ("employee_id") REFERENCES "public"."employees" ("employee_id") ON DELETE CASCADE ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Keys structure for table employee_payment
-- ----------------------------
ALTER TABLE "public"."employee_payment" ADD CONSTRAINT "employee_payment_employee_id_fkey" FOREIGN KEY ("employee_id") REFERENCES "public"."employees" ("employee_id") ON DELETE CASCADE ON UPDATE NO ACTION;
