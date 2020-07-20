package org.jeecg.modules.api.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.system.query.QueryGenerator;
import org.jeecg.common.aspect.annotation.AutoLog;
import org.jeecg.common.util.oConvertUtils;
import org.jeecg.modules.api.entity.SpendRecord;
import org.jeecg.modules.api.service.ISpendRecordService;
import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.jeecg.common.system.base.controller.JeecgController;
import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.def.NormalExcelConstants;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.jeecgframework.poi.excel.view.JeecgEntityExcelView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

 /**
 * @Description: 消费记录主表
 * @Author: jeecg-boot
 * @Date:   2020-07-20
 * @Version: V1.0
 */
@Slf4j
@Api(tags="消费记录主表")
@RestController
@RequestMapping("/api/spendRecord")
public class SpendRecordController extends JeecgController<SpendRecord, ISpendRecordService> {
	@Autowired
	private ISpendRecordService spendRecordService;
	
	/**
	 * 分页列表查询
	 *
	 * @param spendRecord
	 * @param pageNo
	 * @param pageSize
	 * @param req
	 * @return
	 */
	@AutoLog(value = "消费记录主表-分页列表查询")
	@ApiOperation(value="消费记录主表-分页列表查询", notes="消费记录主表-分页列表查询")
	@GetMapping(value = "/list")
	public Result<?> queryPageList(SpendRecord spendRecord,
								   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
								   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
								   HttpServletRequest req) {
		QueryWrapper<SpendRecord> queryWrapper = QueryGenerator.initQueryWrapper(spendRecord, req.getParameterMap());
		Page<SpendRecord> page = new Page<SpendRecord>(pageNo, pageSize);
		IPage<SpendRecord> pageList = spendRecordService.page(page, queryWrapper);
		return Result.ok(pageList);
	}
	
	/**
	 * 添加
	 *
	 * @param spendRecord
	 * @return
	 */
	@AutoLog(value = "消费记录主表-添加")
	@ApiOperation(value="消费记录主表-添加", notes="消费记录主表-添加")
	@PostMapping(value = "/add")
	public Result<?> add(@RequestBody SpendRecord spendRecord) {
		spendRecordService.save(spendRecord);
		return Result.ok("添加成功！");
	}
	
	/**
	 * 编辑
	 *
	 * @param spendRecord
	 * @return
	 */
	@AutoLog(value = "消费记录主表-编辑")
	@ApiOperation(value="消费记录主表-编辑", notes="消费记录主表-编辑")
	@PutMapping(value = "/edit")
	public Result<?> edit(@RequestBody SpendRecord spendRecord) {
		spendRecordService.updateById(spendRecord);
		return Result.ok("编辑成功!");
	}
	
	/**
	 * 通过id删除
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "消费记录主表-通过id删除")
	@ApiOperation(value="消费记录主表-通过id删除", notes="消费记录主表-通过id删除")
	@DeleteMapping(value = "/delete")
	public Result<?> delete(@RequestParam(name="id",required=true) String id) {
		spendRecordService.removeById(id);
		return Result.ok("删除成功!");
	}
	
	/**
	 * 批量删除
	 *
	 * @param ids
	 * @return
	 */
	@AutoLog(value = "消费记录主表-批量删除")
	@ApiOperation(value="消费记录主表-批量删除", notes="消费记录主表-批量删除")
	@DeleteMapping(value = "/deleteBatch")
	public Result<?> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
		this.spendRecordService.removeByIds(Arrays.asList(ids.split(",")));
		return Result.ok("批量删除成功！");
	}
	
	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "消费记录主表-通过id查询")
	@ApiOperation(value="消费记录主表-通过id查询", notes="消费记录主表-通过id查询")
	@GetMapping(value = "/queryById")
	public Result<?> queryById(@RequestParam(name="id",required=true) String id) {
		SpendRecord spendRecord = spendRecordService.getById(id);
		return Result.ok(spendRecord);
	}

  /**
   * 导出excel
   *
   * @param request
   * @param spendRecord
   */
  @RequestMapping(value = "/exportXls")
  public ModelAndView exportXls(HttpServletRequest request, SpendRecord spendRecord) {
      return super.exportXls(request, spendRecord, SpendRecord.class, "消费记录主表");
  }

  /**
   * 通过excel导入数据
   *
   * @param request
   * @param response
   * @return
   */
  @RequestMapping(value = "/importExcel", method = RequestMethod.POST)
  public Result<?> importExcel(HttpServletRequest request, HttpServletResponse response) {
      return super.importExcel(request, response, SpendRecord.class);
  }

}
